import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import com.example.myapplication.InvestmentCard
import org.junit.Rule
import org.junit.Test

class InvestmentCardTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun investmentCardDisplaysCorrectInfo() {
        // Set up
        composeTestRule.setContent {
            InvestmentCard(
                code = "MXRF11",
                earnings = "Rendimento: R$ 0,09",
                amount = "R$ 11,52",
                date = "DAQUI A 2 DIAS"
            )
        }

        // Assert
        composeTestRule.onNodeWithText("MXRF11").assertIsDisplayed()
    }

    @Test
    fun alertDisplaysOnMoreDetailsClick() {
        // Set up
        composeTestRule.setContent {
            InvestmentCard(
                code = "MXRF11",
                earnings = "Rendimento: R$ 0,09",
                amount = "R$ 11,52",
                date = "DAQUI A 2 DIAS"
            )
        }

        // Executa clique no botão "Mais detalhes"
        composeTestRule.onNodeWithText("MXRF11").performClick()

        // Verifica se o título do alerta é exibido
        composeTestRule.onNodeWithText("Detalhes do investimento").assertIsDisplayed()
    }
}
