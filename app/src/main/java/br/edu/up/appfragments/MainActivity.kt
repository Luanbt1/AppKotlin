package br.edu.up.appfragments

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import androidx.fragment.app.replace


class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun carregarFragmento1(item: MenuItem) {
        supportFragmentManager.commit {
            replace<PrimeiroFragment>(R.id.fragmentContainerView)
        }
    }
    fun carregarFragmento2(item: MenuItem) {
        supportFragmentManager.commit {
            replace<SegundoFragment>(R.id.fragmentContainerView)
        }
    }
    fun carregarFragmento3(item: MenuItem) {
        supportFragmentManager.commit {
            replace<TerceiroFragment>(R.id.fragmentContainerView)
        }
    }

}