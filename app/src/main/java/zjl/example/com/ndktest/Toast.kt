package zjl.example.com.ndktest

import android.app.Activity
import android.app.PendingIntent.getActivity
import android.widget.Toast

/**
 * Created by Administrator on 2018/10/23 0023.
 */
fun Activity.toast(message: CharSequence, duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, message, duration).show()
}