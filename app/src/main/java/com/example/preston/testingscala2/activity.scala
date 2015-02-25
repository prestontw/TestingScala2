package com.example.preston.testingscala2
import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class activity extends Activity with testTrait{
  override def onCreate(savedInstance : Bundle): Unit = {
    super.onCreate(savedInstance)
    setContentView(R.layout.activity_main)
    val tv = findViewById(R.id.tvTest).asInstanceOf[TextView]
    tv.setText("" + test.hello(9) + "\n" + testingATrait(9))

  }
}

trait testTrait {
  def testingATrait(n: Int): String = {
    "found " + n
  }

}