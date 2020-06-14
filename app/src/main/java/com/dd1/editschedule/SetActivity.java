package com.dd1.editschedule;

import temp.MyApplication;
import android.app.Activity;
import android.app.AlarmManager;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.PendingIntent;
import android.app.Service;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.AudioManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class SetActivity extends Activity {
    //声明一个SharedPreferences对象，用来保存switch组件的开关信息
    private SharedPreferences preferences = null;
    //editor对象用来向preferences中写入数据
    private SharedPreferences.Editor editor = null;

    //声明一个SharedPreferences对象，用来保存time_choice的值
    private SharedPreferences pre = null;
    //pre_editor对象用来向pre中写入数据
    private SharedPreferences.Editor pre_editor = null;


}
