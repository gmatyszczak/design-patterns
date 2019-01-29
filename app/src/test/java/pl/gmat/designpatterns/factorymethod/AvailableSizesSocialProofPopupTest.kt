package pl.gmat.designpatterns.factorymethod

import org.junit.Assert.assertTrue
import org.junit.Test

class AvailableSizesSocialProofPopupTest {

    private val popup = AvailableSizesSocialProofPopup()

    @Test
    fun createSocialProof() {
        assertTrue(popup.createSocialProof() is AvailableSizesSocialProof)
    }
}