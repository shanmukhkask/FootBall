package example.com.football

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log

/**
 * Created by home on 17-Oct-18.
 */
open class BaseActivity: AppCompatActivity()
{
    val TAG= "myTag"
    override fun onCreate(savedInstanceState: Bundle?)
    {
       Log.d(TAG,"${javaClass.simpleName} oncreate")
        super.onCreate(savedInstanceState)

    }

    override fun onStart()
    {
        Log.d(TAG,"${javaClass.simpleName} onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.d(TAG,"${javaClass.simpleName} onResume")
        super.onResume()
    }

    override fun onRestart() {
        Log.d(TAG,"${javaClass.simpleName} onRestart")
        super.onRestart()
    }
    override fun onPause() {
        Log.d(TAG,"${javaClass.simpleName} onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d(TAG,"${javaClass.simpleName} onStop")
        super.onStop()
    }

    override fun onDestroy()
    {
        Log.d(TAG,"${javaClass.simpleName} onDestroy")
        super.onDestroy()
    }



}