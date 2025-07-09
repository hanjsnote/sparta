package chapter1.array;

public class Main {
    public static void main(String[] args) {
        //모험가 명단을 관리하는법:
        String name1 = "gygim";
        String name2 = "Steve";
        //...

        String[] abventurerList = {"gygim", "Steve", "..."};


        //1. 배열 선언
//        int[] arr;

        //2. 배열 길이 할당

//        arr1 = new int[5];
        //arr = [][][][][]

        //3. 배열 선언과 길이 동시에 할당
        int[] arr2 = new int[5];
        //arr = [][][][][] <- 빈공간

        //4. 배열 선언과 동시에 배열의 요소 할당
        int[] arr3 = {10, 20, 30, 40, 50};
        //[10][20][30][40][50]

        //배열의 길이
        int arrLength = arr3.length;
        System.out.println("arrLength 의 길이 = " + arrLength);

        //문자열 배열 선언
        String[] strArr = new String[5];    //[""][""][""][""][""]

        //논리형 배열 선언
        boolean[] booleanArr = new boolean[3];  //[true][false][true]

        //배열의 요소에 접근: 인덱스 활용 방법
        int arr[] = {10, 20, 30, 40, 50};
        //           [0] [1] [2] [3] [4]
        System.out.println("배열의 1번째 요소 접근: " + arr[0]);
        System.out.println("배열의 2번째 요소 접근: " + arr[1]);
        System.out.println("배열의 3번째 요소 접근: " + arr[2]);
        System.out.println("배열의 4번째 요소 접근: " + arr[3]);
        System.out.println("배열의 5번째 요소 접근: " + arr[4]);

        arr[0] = 100;
        arr[1] = 200;
        arr[2] = 300;
        arr[3] = 400;
        arr[4] = 500;

        System.out.println("배열의 1번째 요소 접근: " + arr[0]);
        System.out.println("배열의 2번째 요소 접근: " + arr[1]);
        System.out.println("배열의 3번째 요소 접근: " + arr[2]);
        System.out.println("배열의 4번째 요소 접근: " + arr[3]);
        System.out.println("배열의 5번째 요소 접근: " + arr[4]);

        //for문으로 배열 탐색
        for(int i = 0; i < arr.length; i++){
            System.out.println("인덱스: " + i + ", 값: "  + arr[i]);
        }

        //향상된 for문
        for (int a : arr){
            System.out.println("값: " + a);
        }

//        String[][] board = new String[2][2];
        String[][] board = {{"멍멍", "야옹"},{"컹컹", "왈왈"}
        };
        System.out.println(board[1][0]);

        //실습 과제
        //1. 1차원 배열에서 짝수만 출력하기 배열 예시 {3, 4, 7, 10, 15, 20}
        int[] intArray = {3, 4, 7, 10, 15, 20};
        System.out.print("짝수만 출력:");
        for(int a : intArray){
            if(a % 2 == 0){
                System.out.print(" " + a);
            }
        }

        //2. 1차원 배열의 누적합 구하기 배열 예시 {2, 5, 8}
        int[] intArray2 = {2, 5, 8};
        int result = 0;
        for(int a : intArray2){
            result += a;
        }
        System.out.println("\n누적합: " + result);

        //3. 2차원 배열에서 검은돌(true)의 좌표 x,y 찾기 배열 예시 boolean[][] board = {{true, false},{false, true}};
        boolean[][] board1 = {{true, false},{false, true}};
        for(int i = 0; i < board1.length; i++){
            for(int j = 0; j < board1[i].length; j++){
                if(board1[i][j] == true){
                    System.out.println("검은돌 위치: " + i + "," + j);
                }
            }
        }


    }
}
