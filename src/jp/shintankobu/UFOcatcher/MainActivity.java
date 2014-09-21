package jp.shintankobu.UFOcatcher;

import android.app.Activity;
import android.graphics.Point;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends Activity {
	public float disp_w;
	public float disp_h;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);


		requestWindowFeature(Window.FEATURE_NO_TITLE);
		Window window = getWindow();
		window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
		WindowManager manager = window.getWindowManager();
		Display disp = manager.getDefaultDisplay();
		Point size = new Point();
		disp.getSize(size);

		setContentView(R.layout.main);

		disp_w = size.x;
		disp_h = size.y;



		Log.v("画面", "幅は"+ disp_w);
		Log.v("画面", "高さは" + disp_h);


	}
}
