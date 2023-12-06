package com.example.roomdatabase.navigasi

interface DestinasiNavigasi {
    /**
     * Nama unik untuk menentukan jalur untuk composable
     */
    val route: String

    /**
     * String Resource id yang berisi judul yang akan ditampilkan di layar halaman
     */
    val titleRes: Int

}