package com.hzw.sortplay.heap;

import com.hzw.sortplay.SortUtils;

/**
 * @author: huangzuwang
 * @date: 2020-06-26 19:14
 * @description: 大根堆
 */
public class Heap {

    private int[] heapArr;

    private int heapSize;

    private int limit;

    public void push(int value) {
        if (heapSize == limit) {
            throw new RuntimeException("heap is full！");
        }
        heapArr[heapSize] = value;
        onHeapInsert(heapArr, heapSize++);
    }

    public Heap() {
        heapArr = new int[128];
        limit = heapArr.length;
    }

    public Heap(int[] heapArr) {
        this.heapArr = heapArr;
        this.heapSize = heapArr.length;
        this.limit = heapArr.length;
        heapify(heapArr);
    }

    /**
     * 把堆中最大值弹出, 剩下的数依然保持大根堆
     *
     * @return
     */
    public int pop() {
        int maxValue = heapArr[0];
        //将尾结点与根节点交换, 并减少size
        SortUtils.swap(heapArr, 0, --heapSize);
        //重新堆化
        heapify(heapArr, 0);
        return maxValue;
    }

    public int getSize() {
        return heapSize;
    }

    /**
     * 将数组堆化
     *
     * @param heapArr
     */
    private void heapify(int[] heapArr) {
        int index = heapSize - 1;
        //从尾结点开始判断每个节点是否需要下沉
        while (index >= 0) {
            heapify(heapArr, index);
            index--;
        }
    }

    /**
     * 堆化, 从index处判断是否需要下沉
     *
     * @param heapArr
     * @param index
     */
    private void heapify(int[] heapArr, int index) {
        // "<<" 要加括号！！！！
        int lcIndex = (index << 1) + 1;
        int rcIndex = lcIndex + 1;
        while (lcIndex < heapSize) {
            int maxChild = rcIndex < heapSize && heapArr[rcIndex] >= heapArr[lcIndex] ? rcIndex : lcIndex;
            int largest = heapArr[index] < heapArr[maxChild] ? maxChild : index;
            if (largest == index){
                //没有子节点比它大
                break;
            }
            SortUtils.swap(heapArr, index, maxChild);
            index = maxChild;
            lcIndex = (index << 1) + 1;
            rcIndex = lcIndex + 1;
        }
        //完全二叉树, 这种情况只可能是到叶子节点了
        if (lcIndex < heapSize) {
            if (heapArr[index] < heapArr[lcIndex]) {
                SortUtils.swap(heapArr, index, lcIndex);
            }
        }

    }


    /**
     * 堆末尾新插入一个节点时，调整结构, 判断新节点是否需要上浮
     *
     * @param heapArr 堆容器数组
     * @param index   插入的下标
     */
    private void onHeapInsert(int[] heapArr, int index) {
        if (index == 0) {
            return;
        }
        //获取父节点下标
        int parent = (index - 1) >> 1;
        while (parent >= 0 && heapArr[index] > heapArr[parent]) {
            SortUtils.swap(heapArr, index, parent);
            index = parent;
            parent = (parent - 1) >> 1;
        }
    }
}
