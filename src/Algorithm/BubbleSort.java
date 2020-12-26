package Algorithm;

/**
 * 제일 큰 원소를 끝자리로 옮기는 작업을 반복
 * 1. for 루프를 돌 때마다 제일 큰 원소를 맨 오른쪽으로 보내고, 정렬할 배열의 크기를 하나씩 줄인다.
 * 2. 안쪽의 for 루프가 하는 일은 인전한 원소끼리 비교하여 swap 시키고, 가장 큰 원소를 맨오른쪽으로 보내는 일
 *
 * 수행 시간:
 * (n-1) + (n-2) + (n-3) + ... + 2 + 1
 * = n(n-1)/2
 * -> O(n^2)
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {5,2,4,3,1};

        advancedBubbleSort(array);
    }

    //해달 알고리즘은 알고리즘이 수행을 시작할 때나 중간에 배열이 이미 정렬되어 있는 상태라도 계속 끝까지 무의미한 순환을 계속한다.
    public static void bubbleSort(int[] array){
        //for last <- n-1 downTo 1
        for (int i=array.length-1; i>0; i--){
            //for j <- 0 to last-1
            for (int j=0; j<i; j++){
                if (array[j] > array[j+1]) {
                    //swap
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        printArray(array);
    }

    /**
     * 1. for 루프가 시작되기 전에 매번 isSorted 라는 표시자를 true로 설정
     * 2. isSorted 가 루프를 도는 동안 변화는지 확인
     * 3. 중간에 한번이라도 isSorted 가 변하지 않으면,
     * 즉, swap 이 한번도 일어나지 않았으면 배열은 이미 정렬되어 있는 상태이므로 루프 종료
     * O(n)
     * */
    public static void advancedBubbleSort(int[] array) {
        //for last <- n-1 downTo 1
        for (int i=array.length-1; i>0; i--){
            boolean isSorted = true;
            //for j <- 0 to last-1
            for (int j=0; j<i; j++){
                if (array[j] > array[j+1]) {
                    //swap
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    isSorted = false;
                }
            }
            if (isSorted) {
                break;
            }
        }
        printArray(array);
    }

    public static void printArray(int[] array){
        for (int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
