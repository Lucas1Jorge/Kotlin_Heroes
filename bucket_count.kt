fun bucket_count(nums: IntArray): IntArray {
    val A = ArrayList<Int>(101);
    for (i in 0 .. 100)
        A.add(0);
    
    for (i in 0 until nums.size) {
        A[nums[i]]++;
    }
    // println(A);
    
    for (i in 1 .. 100)
        A[i] += A[i - 1];
    
    val ans = IntArray(nums.size);
    for (i in 0 until nums.size) {
        if (nums[i] == 0)
            ans[i] = 0;
        else
            ans[i] = A[nums[i] - 1];
    }
    
    return ans;
}

fun main(args: Array<String>) {
    val nums: IntArray = intArrayOf(1, 8, 9, 1, 5);

    val ans: IntArray = bucket_count(nums);
    for (i in 0 until ans.size) {
        println(ans[i]);
    }
}