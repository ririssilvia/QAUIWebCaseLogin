import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.facebook.com/')

// Mengisi kolom username
WebUI.setText(findTestObject('Object Repository/Page_Facebook  log in or sign up/input_Facebook helps you connect and share _ccef60'), 
    '083130066682')

// Mengisi kolom password
WebUI.setEncryptedText(findTestObject('Object Repository/Page_Facebook  log in or sign up/input_Facebook helps you connect and share _ab63fc'), 
    'vfiPXam91Zq/S59gQL1Kdg==')

// Tunggu hingga tombol "Log in" hadir
WebUI.waitForElementPresent(findTestObject('FB/Page_Facebook  log in or sign up/button_Log in'), 30)

// Verifikasi elemen "Log in" visible
WebUI.verifyElementVisible(findTestObject('FB/Page_Facebook  log in or sign up/button_Log in'))

// Klik tombol "Log in"
WebUI.click(findTestObject('FB/Page_Facebook  log in or sign up/button_Log in'))

// Tunggu hingga halaman berikutnya dimuat (opsional, tergantung pada halaman setelah login)
WebUI.waitForPageLoad(30)

WebUI.closeBrowser()

