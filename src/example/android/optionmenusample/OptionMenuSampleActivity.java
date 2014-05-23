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



	// onCreateOptionsMenu���\�b�h(�I�v�V�������j���[����)
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_option_menu_sample, menu);
		return true;
	}

		// onOptionsItemSelected���\�b�h(���j���[�A�C�e���I������)
		@Override
		public boolean onOptionsItemSelected(MenuItem item) {
			switch (item.getItemId()) {
				case R.id.item1:
					showDialog("���j���[�A�C�e��1��I�����܂����B");
					return true;
				case R.id.item2:
					showDialog("���j���[�A�C�e��2��I�����܂����B");
					return true;
				case R.id.item3:
					showDialog("���j���[�A�C�e��3��I�����܂����B");
					return true;
				default:
					return super.onOptionsItemSelected(item);
			}
		}

		// showDialog���\�b�h(�_�C�A���O�\��)
		private void showDialog(String text) {
			AlertDialog.Builder dialog
					=new AlertDialog.Builder(OptionMenuSampleActivity.this);
			dialog.setTitle("���j���[�A�C�e���I������");
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

