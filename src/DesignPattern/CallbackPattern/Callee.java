package DesignPattern.CallbackPattern;

import java.util.Scanner;

public class Callee {
    Callback callback;
    Response response;

    Callee() {
        this.callback = null;
        this.response = null;
    }

    public void setCallback(Callback callback) {
        this.callback = callback;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("성공:0 / 실패:1");
        int result = scanner.nextInt();

        switch (result) {
            case 0: {
                response = new Response(200, "성공");
                this.callback.onSuccess(response);
            }
            case 1: {
                response = new Response(404, "실패");
                this.callback.onFailure(response);
            }
        }
    }
}
