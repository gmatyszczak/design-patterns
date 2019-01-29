package pl.gmat.designpatterns.factorymethod

import org.junit.Assert.assertTrue
import org.junit.Test

class CurrentlyWatchingSocialProofPopupTest {

    private val popup = CurrentlyWatchingSocialProofPopup()

    @Test
    fun createSocialProof() {
        assertTrue(popup.createSocialProof() is CurrentlyWatchingSocialProof)
    }
}