package example.com.football.activitypkg

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import example.com.football.R
import example.com.football.utilities.EXTRA_LEAGUE
import example.com.football.utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : AppCompatActivity() {

    var league=""
    var skill=""
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league=intent.getStringExtra(EXTRA_LEAGUE)
      //  Toast.makeText(this,league,Toast.LENGTH_SHORT).show()

    }
    fun onBegginerClick(view:View)
    {
        ballerBtn.isChecked=false
        skill="Begginer"
    }
    fun onBallerClick(view: View) {
        bigginerButton.isChecked=false
        skill="Baller"
    }
    fun onFinish(view: View)
    {
        if (skill !="")
        {
            val intent=Intent(this,FinishActivity::class.java)
            intent.putExtra(EXTRA_LEAGUE,league)
            intent.putExtra(EXTRA_SKILL,skill)
            startActivity(intent)
        }else {
            Toast.makeText(this,"please select a skill level",Toast.LENGTH_SHORT).show()
        }

    }
}
