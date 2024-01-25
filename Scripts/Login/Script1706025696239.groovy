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
import org.openqa.selenium.internal.FindsById as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.jamtangan.com/')

WebUI.click(findTestObject('Object Repository/Home/button_OKE'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Home/button-masuk'))

WebUI.click(findTestObject('Object Repository/Home/button-masuk'))

WebUI.setText(findTestObject('Object Repository/Home/input_username'), 'testzu@grr.la')

WebUI.setEncryptedText(findTestObject('Object Repository/Home/input_password'), 'Hr3L6svCxzhUPLgopC4Brg==')

WebUI.click(findTestObject('Object Repository/Home/button_Masuk'))

WebUI.waitForPageLoad(50000)

WebUI.verifyElementClickable(findTestObject('Object Repository/Home/button_x'))

WebUI.click(findTestObject('Object Repository/Home/button_x'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Home/field_search'))

WebUI.setText(findTestObject('Object Repository/Home/field_search'), 'Alba')

WebUI.verifyElementClickable(findTestObject('Object Repository/Home/Click_search'))

WebUI.click(findTestObject('Object Repository/Home/Click_search'))

WebUI.waitForPageLoad(50000)

WebUI.verifyElementClickable(findTestObject('Object Repository/Home/button_x (1)'))

WebUI.click(findTestObject('Object Repository/Home/button_x (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Home/button_lewati'))

WebUI.click(findTestObject('Object Repository/Home/button_lewati'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Home/click_filter'))

WebUI.click(findTestObject('Object Repository/Home/click_filter'))

WebUI.click(findTestObject('Object Repository/Home/alba_am3969x1'))

WebUI.click(findTestObject('Object Repository/Home/Button_beli'))

WebUI.click(findTestObject('Object Repository/Home/button_lanjutkan'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Home/drop_pengiriman'))

WebUI.click(findTestObject('Object Repository/Home/drop_pengiriman'))

WebUI.click(findTestObject('Object Repository/Home/click_pengiriman'))

WebUI.click(findTestObject('Object Repository/Home/pilih_pembayaran'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Home/pay_VA'))

WebUI.click(findTestObject('Object Repository/Home/pay_VA'))

WebUI.verifyElementText(findTestObject('Object Repository/Home/total_harga'), 'Rp879.000')

WebUI.verifyElementClickable(findTestObject('Object Repository/Home/order_now'))

