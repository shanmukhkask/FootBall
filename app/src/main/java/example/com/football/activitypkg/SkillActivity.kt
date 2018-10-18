package example.com.football.activitypkg

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import example.com.football.R
import example.com.football.modal.Player
import example.com.football.utilities.EXTRAPLAYER
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : AppCompatActivity()
{

    lateinit var player: Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        player=intent.getParcelableExtra(EXTRAPLAYER)
    }
    fun onBegginerClick(view:View)
    {
        ballerBtn.isChecked=false
        player.skill="Begginer"
    }
    fun onBallerClick(view: View) {
        bigginerButton.isChecked=false
        player.skill="Baller"
    }
    fun onFinish(view: View)
    {
        if (player.skill !="")
        {
            val intent=Intent(this,FinishActivity::class.java)
            intent.putExtra(EXTRAPLAYER,player)
            startActivity(intent)
        }else {
            Toast.makeText(this,"please select a skill level",Toast.LENGTH_SHORT).show()
        }

    }
}
