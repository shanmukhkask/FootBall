package example.com.football.activitypkg

import android.content.Intent
import android.os.Bundle
import example.com.football.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity()
{

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getStartedbtn.setOnClickListener {
            startActivity(Intent(this, LeagueActivity::class.java))
        }
    }

}
