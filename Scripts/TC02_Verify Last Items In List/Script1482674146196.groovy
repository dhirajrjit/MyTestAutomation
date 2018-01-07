import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.util.internal.PathUtil as PathUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint

Mobile.comment('Story: Verify correct alarm message')

Mobile.comment('Given that user has started an application')

'Get full directory\'s path of android application'
not_run: def appPath = PathUtil.relativeToAbsolutePath(GlobalVariable.G_AndroidApp, RunConfiguration.getProjectDir())

not_run: Mobile.startApplication(appPath, false)

'Get full directory\'s path of android application'
def appPath = PathUtil.relativeToAbsolutePath(GlobalVariable.G_AndroidApp1, RunConfiguration.getProjectDir())

Mobile.startApplication(appPath, false)

Mobile.comment('And he navigates the application to Graphics form')

Mobile.tap(findTestObject('Application/android.widget.TextView5 - Graphics'), GlobalVariable.G_Timeout)

Mobile.comment('When he scroll to Xfermodes text')

Mobile.scrollToText('Xfermodes')

Mobile.comment('Then the current screen should show Xfermodes text after scrolling')

'Get item\'s label'
def itemText = Mobile.getText(findTestObject('Application/Graphics/android.widget.TextView - Xfermodes'), GlobalVariable.G_Timeout)

Mobile.verifyEqual(itemText, 'Xfermodes')

Mobile.pressBack()

Mobile.tap(findTestObject('Application/android.widget.TextView2 - Animation'), 10)

Mobile.tap(findTestObject('Application/Animation/android.widget.TextView1 - Bouncing Balls'), 10)

Mobile.pressBack()

Mobile.pressBack()

Mobile.closeApplication()

