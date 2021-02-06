package sync.lookup;

class Post {
    private int count = 0;
    private Integer wrapperCount = 0;

    //게시물 조회하면, 카운트 증가
    public int view(){
        return ++count;
    }

    //해결방법1. 암시적 lock
    //문제점: 병렬성 저하
    public synchronized int syncView(){
        return ++count;
    }

    //변수lock
    public int syncWrapperView(){
        synchronized (this.wrapperCount){
            return ++wrapperCount;
        }
    }

    public int getCount(){
        return count;
    }
}

public class LookUp {
    public static void main(String[] args) {
        Post post = new Post();
        // 100개의 쓰레드가 각각 게시물을 100번씩 동시다발적으로 조회
        for (int i=0; i<100; i++){
            new Thread(){
                @Override
                public void run() {
                    super.run();
                    for (int i=0; i<100; i++){
//                        post.view();
//                        post.syncView();
                        System.out.println(post.syncWrapperView());
//                        System.out.println(post.getCount());
                    }
                }
            }.start();
        }

//        System.out.println("조회 끝:"+ post.getCount());
    }
}
