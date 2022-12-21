package nl.tno.federated.ishare

import nl.tno.federated.ishare.config.ISHAREConfig
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import kotlin.test.assertEquals
import kotlin.test.assertTrue

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class ISHARETests {

    private val config = ISHAREConfig.loadProperties("ishare.properties")
//    private val iTools = ISHARETools(config)

    @Test
    fun `1 - Test config file`() {
        assertEquals("", config.EORI)
        assertEquals("", config.key)
        assertEquals("", config.pass)
        assertEquals("", config.cert)
        assertEquals("", config.schemeURL)
    }

//    @Test
//    fun `2 - Create a client assertion and check it`() {
//        val tokenRequest = iTools.getTokenRequest()
//        val checkTokenRequest = iTools.checkTokenRequest(tokenRequest)
//        assertTrue(actual = checkTokenRequest.first, message = checkTokenRequest.second)
//    }
//
//    @Test
//    fun `3 - Check consumer status with iSHARE`() {
//        assertTrue{ iTools.checkPartyWithScheme(config.EORI)}
//    }
//
//    @Test
//    fun `4 - Create AccessToken and check it` () {
//        assertTrue { iTools.checkAccessToken(iTools.createAccessToken(config.EORI)).first}
//    }
}