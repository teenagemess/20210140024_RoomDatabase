package com.example.roomdatabase

import android.app.Application
import com.example.roomdatabase.repositori.ContainerApp
import com.example.roomdatabase.repositori.ContainerDataApp
class AplikasiSiswa : Application() {
    /**
     * Appcontainer instance digunakan oleh kelas kelas lainnya untuk mendapatkan depedensi
     */

    lateinit var container: ContainerApp

    override fun onCreate(){
        super.onCreate()
        container = ContainerDataApp(this)
    }
}