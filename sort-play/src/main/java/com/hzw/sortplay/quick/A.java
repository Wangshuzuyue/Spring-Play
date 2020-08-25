package com.hzw.sortplay.quick;

class A {
    public int firstMissingPositive(int[] nums) {
        if(nums == null || nums.length == 0){
            return 1;
        }
        sort(nums, 0, nums.length - 1);
        int value = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0){
                if(nums[i] == value + 1){
                    value = nums[i];
                }else{
                    return value + 1;
                }
            }
        }
        return value + 1;
    }

    private void sort(int[] nums, int l, int r){
        if(l >= r){
            return;
        }
        //可增加快排效率
        int offset = (int)(Math.random() * (r - l + 1));
        swap(nums, l + offset, r);
        int[] equalArea = netherLandFlag(nums, l, r);
        sort(nums, l, equalArea[0] - 1);
        sort(nums, equalArea[1] + 1, r);
    }

    // 荷兰国旗
    private int[] netherLandFlag(int[] nums, int l, int r){
        int less = l - 1;
        int more = r;
        int i = 0;
        while(i <= r){
            if(nums[i] < nums[r]){
                swap(nums, i, ++less);
                i++;
            }else if(nums[i] == nums[r]){
                i++;
            }else{
                //大于
                swap(nums, i, --more);
            }
            if(i == more){
                swap(nums, i, r);
                break;
            }
        }
        return new int[]{less + 1, i};
    }

    private void swap(int[] arr, int x, int y){
        if(x == y){
            return;
        }
        int tmp = arr[x];
        arr[x] = arr[y];
        arr[y] = tmp;
    }

    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.firstMissingPositive(new int[]{3,4,-1,1}));
    }
}