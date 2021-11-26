package com.example.discountapp.data

import com.example.discountapp.R
import com.example.discountapp.R.drawable.p1
import com.example.discountapp.R.drawable.p2

object  DataProvider {

    val productsList = listOf(
        Product(
            id = 1,
            title = "NIKE AIR VAPORMAX EVO",
            price = 755,
            code = "SMILE20",
            link = "https://www.zalando.pl/nike-sportswear-air-vapormax-evo-unisex-sneakersy-niskie-black-ni112o0gv-q11.html",
            image = p1
        ),Product(
            id = 2,
            title = "NIKE AIR MAX 2090",
            price = 464,
            code = "SMILE20",
            link = "https://www.zalando.pl/nike-sportswear-air-max-2090-sneakersy-niskie-blackwhitewolf-greyanthracite-ni115o02c-q11.html",
            image = p2
        ),Product(
            id = 3,
            title = "NIKE AIR PRESTO",
            price = 450,
            code = "SMILE20",
            link = "https://www.zalando.pl/nike-sportswear-air-presto-sneakersy-niskie-blackwhite-ni112o0h0-q11.html",
            image = R.drawable.p3
        ),Product(
            id = 4,
            title = "ADIDAS EQ19 RUN",
            price = 242,
            code = "SMILE20",
            link = "https://www.zalando.pl/adidas-performance-eq19-run-obuwie-do-biegania-treningowe-core-blackgrey-six-ad542a43h-q12.html",
            image = R.drawable.p4
        ),Product(
            id = 5,
            title = "ADIDAS NMD_R1 UNISEX",
            price = 341,
            code = "SMILE20",
            link = "https://www.zalando.pl/adidas-originals-nmd_r1-unisex-sneakersy-niskie-core-blacksilver-metallicsolar-red-ad115o0tj-q11.html",
            image = R.drawable.p5
        ),Product(
            id = 6,
            title = "VERSACE TRIGRECA",
            price = 2753,
            code = "",
            link = "https://www.vitkac.com/pl/p/buty-sportowe-trigreca-versace-buty-1528634",
            image = R.drawable.p6
        ),Product(
            id = 7,
            title = "OFF-WHITE MID TOP VULCANIZED",
            price = 998,
            code = "",
            link = "https://www.vitkac.com/pl/p/buty-sportowe-za-kostke-mid-top-vulcanized-off-white-1-buty-1534225",
            image = R.drawable.p7
        ),Product(
            id = 8,
            title = "GIUSEPPE ZANOTTI MAY LONDON",
            price = 2336,
            code = "",
            link = "https://www.vitkac.com/pl/p/buty-sportowe-may-london-giuseppe-zanotti-buty-nero-1525759",
            image = R.drawable.p8
        ),
        )
}
