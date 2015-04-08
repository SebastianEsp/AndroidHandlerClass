package sen.tec.dk.handlerclass;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity{

    Button btn_Ok;
    TextView textView_Writeable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_Ok = (Button)findViewById(R.id.button_Ok);
        button_Handler btn_Handler = new button_Handler(this);
        btn_Ok.setOnClickListener(btn_Handler);
        textView_Writeable = (TextView)findViewById(R.id.TextField_textWriter);
    }
}
