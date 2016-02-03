package com.yzh.nuc.www.cloudnotes.streetsdkdemo;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.tencent.streetsdkdemo.MainActivity.DemoInfo;

public class MainActivity extends Activity {

	private static final DemoInfo[] demos = {
			new DemoInfo(R.string.demo_lable_pano_activity, 
					R.string.demo_desc_pano_activity, PanoramaActivity.class),
			new DemoInfo(R.string.demo_lable_pano_fragment, 
					R.string.demo_desc_pano_fragment, PanoramaFragActivity.class)
	};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		ListView listView = new ListView(this);
		DemoAdapter adapter = new DemoAdapter(this, demos);
		listView.setAdapter(adapter);
		listView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainActivity.this,
						demos[position].getActivityClass());
				startActivity(intent);
			}
		});
		listView.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, 
				LayoutParams.MATCH_PARENT));
		setContentView(listView);
	}
	
	static class DemoInfo {
		private final int mLableId;
		private final int mDescId;
		private final Class<? extends Activity> mDemoActivityClass;

		public DemoInfo(int lableId, int descId, 
				Class<? extends Activity> demoActivityClass) {
			mLableId = lableId;
			mDescId = descId;
			mDemoActivityClass = demoActivityClass;
		}
		
		public int getLableId() {
			return mLableId;
		}
		
		public int getDescId() {
			return mDescId;
		}
		
		public Class<? extends Activity> getActivityClass() {
			return mDemoActivityClass;
		}
	}
}

class DemoAdapter extends BaseAdapter {

	private Context mContext;
	private MainActivity.DemoInfo[] mDemos;
	private LayoutInflater mInflater;

	public DemoAdapter() {
		super();
	}

	public DemoAdapter(Context context, MainActivity.DemoInfo[] demos) {
		// TODO Auto-generated constructor stub
		mContext = context;
		mDemos = demos;
		mInflater = LayoutInflater.from(mContext);
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return mDemos.length;
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return mDemos[position];
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		ViewHolder holder;
		if (convertView == null) {
			convertView = mInflater.inflate(R.layout.demo_list_item, null);
			holder = new ViewHolder();
			holder.lable = (TextView)convertView.findViewById(R.id.lable);
			holder.description = (TextView)convertView.findViewById(R.id.desc);
			
			convertView.setTag(holder);
		} else {
			holder = (ViewHolder) convertView.getTag();
		}
		holder.lable.setText(mDemos[position].getLableId());
		holder.description.setText(mDemos[position].getDescId());
		return convertView;
	}
	
	static class ViewHolder {
		TextView lable;
		TextView description;
	}
}

