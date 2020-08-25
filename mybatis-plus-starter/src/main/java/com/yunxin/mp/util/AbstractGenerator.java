package com.hzw.mybatis.lessxml.utils;//package com.yunxin.mp.util;

import com.google.common.base.Preconditions;
import lombok.Setter;
import org.apache.ibatis.executor.keygen.KeyGenerator;

import java.util.Calendar;

public abstract class AbstractGenerator implements KeyGenerator {

    public static final long EPOCH;

    protected static final long SEQUENCE_BITS = 17L;

    protected static final long WORKER_ID_BITS = 5L;

    protected static final long SEQUENCE_MASK = (1 << SEQUENCE_BITS) - 1;

    protected static final long WORKER_ID_LEFT_SHIFT_BITS = SEQUENCE_BITS;

    protected static final long TIMESTAMP_LEFT_SHIFT_BITS = WORKER_ID_LEFT_SHIFT_BITS + WORKER_ID_BITS;

    protected static final long WORKER_ID_MAX_VALUE = 1L << WORKER_ID_BITS;

    /**
     * 取32的倍数, 一万以内最大的数是9984
     */
    protected static final int RANDOM_BOUND = 9984;

    public static long workerId;

    @Setter
    protected static TimeService timeService = new TimeService();

    static {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2019, Calendar.JANUARY, 1);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        EPOCH = calendar.getTimeInMillis();
    }

    @Override
    public void setWorkerId(final long workerId) {
        Preconditions.checkArgument(workerId >= 0L && workerId < WORKER_ID_MAX_VALUE);
        AbstractGenerator.workerId = workerId;
    }

    @Override
    public long getWorkerId() {
        return AbstractGenerator.workerId;
    }

    @Override
    public long generateKey() {
        return 0;
    }

    @Override
    public long generateBusinessKey(long coreId) {
        return 0;
    }

    /**
     * 等待到下一个毫秒
     *
     * @param lastTime
     * @return
     */
    protected long waitUntilNextTime(final long lastTime) {
        long time = timeService.getCurrentMillis();
        while (time <= lastTime) {
            time = timeService.getCurrentMillis();
        }
        return time;
    }

}
