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

WebUI.navigateToUrl('https://test2-fcubs.vcntppjk.aucsban01.oracleoutsourcing.com/FCJNeoWeb/SMMDIFRM.jsp')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Login/Page_Oracle Financial Services/input_You are about to log into Test2_Ok (1)'))

WebUI.setText(findTestObject('Object Repository/Login/Page_Oracle Financial Services/input_User ID_USERID'), 'JFOY01')

WebUI.setEncryptedText(findTestObject('Object Repository/Login/Page_Oracle Financial Services/input_Password_user_pwd'), 
    'ioGhp4cZSTQfdiwmXi07zg==')

WebUI.click(findTestObject('Object Repository/Login/Page_Oracle Financial Services/input_Password_submit'))

WebUI.click(findTestObject('Object Repository/Login/Page_JFOY01 - 000 - 000 - 000 - Oracle Fina_619d50/td_Current Time 153807_noteTD'))

WebUI.click(findTestObject('Object Repository/Login/Page_JFOY01 - 000 - 000 - 000 - Oracle Fina_619d50/input_Current Time 153807_Ok (1)'))

WebUI.click(findTestObject('Object Repository/Login/Page_JFOY01 - 000 - 000 - 000 - Oracle Fina_619d50/span_Customer'))

WebUI.click(findTestObject('Object Repository/Login/Page_JFOY01 - 000 - 000 - 000 - Oracle Fina_1450fe/input_VALUE_VALUE'))

WebUI.setText(findTestObject('Object Repository/Login/Page_JFOY01 - 000 - 000 - 000 - Oracle Fina_1450fe/input_VALUE_VALUE'), 
    '0004302')

WebUI.click(findTestObject('Object Repository/Login/Page_JFOY01 - 000 - 000 - 000 - Oracle Fina_1450fe/button_Search'))

WebUI.doubleClick(findTestObject('Object Repository/Login/Page_JFOY01 - 000 - 000 - 000 - Oracle Fina_1450fe/input_Select Row0_FULL_NAME'))

WebUI.click(findTestObject('Object Repository/Login/Page_JFOY01 - 000 - 000 - 000 - Oracle Fina_1450fe/label_Script User'))

WebUI.click(findTestObject('Object Repository/Login/Page_JFOY01 - 000 - 000 - 000 - Oracle Fina_1450fe/li_Sign Off'))

WebUI.click(findTestObject('Object Repository/Login/Page_JFOY01 - 000 - 000 - 000 - Oracle Fina_1450fe/input_Do you want to Signoff_Ok (1)'))

WebUI.click(findTestObject('Object Repository/Login/Page_Oracle Financial Services/input_You are about to log into Test2_Ok (1)'))

WebUI.closeBrowser()

