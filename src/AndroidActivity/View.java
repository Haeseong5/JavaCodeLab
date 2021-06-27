package AndroidActivity;

public class View {
    OnClickListener mOnClickListener;
    OnLongClickListener mOnLongClickListener;

    public void setOnClickListener(OnClickListener onClickListener) {
        mOnClickListener = onClickListener;
    }

    public void setOnLongClickListener(OnLongClickListener onLongClickListener){
        this.mOnLongClickListener = onLongClickListener;
    }

    public Boolean callOnClick(){
        if (mOnClickListener != null){
            mOnClickListener.onClick(this);
            return true;
        }
        return false;
    }

    public void performLongClick(){
        mOnLongClickListener.onLongClick(this);
    }

    public boolean hasOnClickListeners() {
        return (mOnClickListener != null);
    }
}

class TextView extends View {

}

class Button extends View implements OnLongClickListener{

    private final Runnable mRunnable = new Runnable() {
        public void run() {
            if (hasOnClickListeners()) {
                callOnClick();
            }
        }
    };

    @Override
    public void onLongClick(View v) {
        mRunnable.run();
    }
}
