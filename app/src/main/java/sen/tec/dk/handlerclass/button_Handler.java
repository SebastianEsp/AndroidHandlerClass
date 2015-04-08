package sen.tec.dk.handlerclass;

import android.view.View;

public class button_Handler implements View.OnClickListener
{
    MainActivity mainActivity;

    public button_Handler(MainActivity mainActivity)
    {
       this.mainActivity = mainActivity;
    }

    @Override
    public void onClick(View v)
    {
        mainActivity.textView_Writeable.setText("The button was clicked and text has been set");
    }
}
