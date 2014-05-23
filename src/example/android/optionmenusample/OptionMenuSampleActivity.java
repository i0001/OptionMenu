package example.android.optionmenusample;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.Menu;
import android.view.MenuItem;

public class OptionMenuSampleActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_option_menu_sample);
	}



	// onCreateOptionsMenuメソッド(オプションメニュー生成)
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_option_menu_sample, menu);
		return true;
	}

		// onOptionsItemSelectedメソッド(メニューアイテム選択処理)
		@Override
		public boolean onOptionsItemSelected(MenuItem item) {
			switch (item.getItemId()) {
				case R.id.item1:
					showDialog("メニューアイテム1を選択しました。");
					return true;
				case R.id.item2:
					showDialog("メニューアイテム2を選択しました。");
					return true;
				case R.id.item3:
					showDialog("メニューアイテム3を選択しました。");
					return true;
				default:
					return super.onOptionsItemSelected(item);
			}
		}

		// showDialogメソッド(ダイアログ表示)
		private void showDialog(String text) {
			AlertDialog.Builder dialog
					=new AlertDialog.Builder(OptionMenuSampleActivity.this);
			dialog.setTitle("メニューアイテム選択結果");
			dialog.setMessage(text);
			dialog.setPositiveButton("OK",new DialogInterface.OnClickListener() {
				public void onClick(DialogInterface dialog,int whichButton) {
					OptionMenuSampleActivity.this.setResult(Activity.RESULT_OK);
				}
			});
			dialog.create();
			dialog.show();
		}

	}

