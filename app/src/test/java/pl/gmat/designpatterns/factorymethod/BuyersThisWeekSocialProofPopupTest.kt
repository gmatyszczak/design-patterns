package pl.gmat.designpatterns.factorymethod

import org.junit.Assert.assertTrue
import org.junit.Test

class BuyersThisWeekSocialProofPopupTest {

    private val popup = BuyersThisWeekSocialProofPopup()

    @Test
    fun createSocialProof() {
        assertTrue(popup.createSocialProof() is BuyersThisWeekSocialProof)
    }
}