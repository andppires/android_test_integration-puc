package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                Scaffold(
                    bottomBar = {BottomNavigationBar()}
                ) { paddingValues ->
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(Color(0xFF1E1EFF))
                            .padding(paddingValues)
                            .padding(horizontal = 16.dp)
                    ) {
                        Text(
                            text = "R$ 43,62",
                            fontSize = 32.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White,
                            modifier = Modifier
                                .padding(vertical = 16.dp)
                                .align(Alignment.CenterHorizontally)
                        )
                        Spacer(modifier = Modifier.height(16.dp))
                        InvestmentCard(
                            "MXRF11",
                            "Rendimento: R$ 0,09",
                            "R$ 11,52",
                            "DAQUI A 2 DIAS"
                        )
                        InvestmentCard(
                            "VISC11",
                            "Rendimento: R$ 0,80",
                            "R$ 10,40",
                            "DAQUI A 2 DIAS"
                        )
                        InvestmentCard(
                            "RVBI11",
                            "Rendimento: R$ 0,75",
                            "R$ 18,75",
                            "DAQUI A 3 DIAS"
                        )
                        InvestmentCard("CPTS11", "Rendimento: R$ 0,07", "R$ 2,95", "DAQUI A 5 DIAS")
                        InvestmentCard("MCHY11", "Rendimento: NÃO INFORMADO", "--", "NÃO INFORMADO")
                    }
                }
            }
        }
    }
}