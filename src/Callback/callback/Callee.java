package Callback.callback;
import java.util.Scanner;

public class Callee {
    Callback callback;
    DataResponse dataResponse;

    Callee(){
        this.callback = null;
        this.dataResponse = null;
    }

    public void setCallback(Callback callback){
        this.callback = callback;
    }

    public void execute(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("성공:0 / 실패:1");
        int result = scanner.nextInt();

        switch (result) {
            case 0 -> {
                dataResponse = new DataResponse(200, "성공");
                this.callback.onSuccess(dataResponse);
            }
            case 1 -> {
                dataResponse = new DataResponse(404, "실패");
                this.callback.onFailure(dataResponse);
            }
        }


    }



}
