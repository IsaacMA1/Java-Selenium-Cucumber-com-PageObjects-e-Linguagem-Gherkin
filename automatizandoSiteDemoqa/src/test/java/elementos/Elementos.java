package elementos;

import org.openqa.selenium.By;

public class Elementos {

	// Elementos Usado No Login

	public By CTS = By.cssSelector("#app > div");
	public By fazerCadastro = By.xpath("//a[@class='btn btn-primary-shadow btn-block']");
	public By firstName = By.xpath("//input[@name='firstName']");
	public By lastName = By.xpath("//input[@name='lastName']");
	public By email = By.xpath("//input[@name='email']");
	public By mobile = By.xpath("//input[@name='mobile']");
	public By country = By.xpath("//select[@name='country']");
	public By city = By.xpath("//input[@name='city']");
	public By msg = By.xpath("//textarea[@name='message']");
	public By btnSend = By.xpath("//button[@class='btn btn-block btn-primary']");

	// Elementos Usado Na Pagina Home

	public By btnHome = By.xpath("//ul[@class='navbar__links d-none d-lg-flex']//*[contains(text(),'Home')]");
	public By btnEnrollYourSelf = By.xpath("//a[@href='/selenium-training?q=banner#enroll-form']");
	public By btnReadMore = By.xpath("//a[@class='new-training__read-more']");
	public By btnTecnologia = By.xpath("//a[@href='https://www.toolsqa.com/testrigor/testrigor-tutorial']");
	public By btnArticle = By.xpath("//img[@alt='Enhancing Test Automation with testRigor Integrations']");
	public By btnTeam = By.xpath("//ul[@class='links']//a[@href='https://www.linkedin.com/company/9458062/']");
	public By btnTwitter = By.xpath("//a[@href='https://twitter.com/toolsqa']");

	// Elementos Usado No botao SeleniumTrainimg

	public By btnSeleniumTrainimg = By.xpath("//a[@href='/selenium-training?q=headers']");

	// Elementos Usado No botao Demo Site

	public By btnDemoSite = By.xpath("//div[@class='col-auto']//a[@href='https://demoqa.com']");

	// Elementos Usado No botao Demo Site

	public By btnAbout = By.xpath("//ul[@class='navbar__links d-none d-lg-flex']//*[contains(text(),'About')]");

	// Elementos Usado No botao Tutorials

	public By btnTutorials = By.xpath("//a[@class='navbar__tutorial-menu']");
	public By btnQAPractices = By.xpath(" //div[@class='first-generation']//*[contains(text(),'QA Practices')]");
	public By btnSoftwareTesting = By
			.xpath("//ul[@class='active']//a[@href='/software-testing/software-testing-tutorial/']");
	public By btnBackEndTestingAutomation = By
			.xpath("//div[@class='first-generation']//*[contains(text(),'Back-End Testing Automation')]");
	public By btnRestAssured = By.xpath("//div[@class='second-generation']//a[@href='/rest-assured-tutorial/']");

	// Elementos Usado Na pagina inicial botao elements e pagina de elements

	public By btnElements = By.xpath("//div[@class='category-cards']//*[contains(text(),'Elements')]");
	public By btnTextBox = By.xpath("//div[@class='element-list collapse show']//li[@id='item-0']");
	public By btnUserName = By.xpath("//input[@class=' mr-sm-2 form-control']");
	public By btnUserEmail = By.xpath("//input[@class='mr-sm-2 form-control']");
	public By btnCurrentAddress = By.xpath("//textarea[@id='currentAddress']");
	public By btnPermanentAddress = By.xpath("//textarea[@id='permanentAddress']");
	public By btnSubmit = By.xpath("//button[@id='submit']");
	public By btnChecktBox = By.xpath("//div[@class='element-list collapse show']//li[@id='item-1']");
	public By btnPastaHome = By.xpath("//label[@for='tree-node-home']");
	public By btnSetaMais = By.xpath("//button[@class='rct-option rct-option-expand-all']");
	public By btnRadionButton = By.xpath("//div[@class='element-list collapse show']//li[@id='item-2']");
	public By btnYesRadion = By.xpath("//*[contains(text(),'Yes')]");
	public By btnWebTable = By.xpath("//div[@class='element-list collapse show']//li[@id='item-3']");
	public By btnAdd = By.xpath("//button[@id='addNewRecordButton']");
	public By btnFormularioWebTableFirstName = By.xpath("//input[@placeholder='First Name']");
	public By btnFormularioWebTableLastName = By.xpath("//input[@placeholder='Last Name']");
	public By btnFormularioWebTableEmail = By.xpath("//input[@placeholder='name@example.com']");
	public By btnFormularioWebTableFAge = By.xpath("//input[@placeholder='Age']");
	public By btnFormularioWebTableSalary = By.xpath("//input[@placeholder='Salary']");
	public By btnFormularioWebDepartment = By.xpath("//input[@placeholder='Department']");
	public By btnFormularioWebSubmit = By.xpath("//button[@id='submit']");
	public By btnFormularioWebCampoDePesquisa = By.xpath("//input[@placeholder='Type to search']");
	public By btnFormularioWebTableRemoverItem = By.xpath("//span[@id='delete-record-2']");
	public By btnFormularioWebTableEditarItem = By.xpath("//span[@id='edit-record-3']");
	public By btnButtons = By.xpath("//div[@class='element-list collapse show']//li[@id='item-4']");
	public By btnButtonsClickRight = By.xpath("//button[@id='rightClickBtn']");
	public By btnDoubleClick = By.xpath("//button[@id='doubleClickBtn']");
	public By btnUploadAndDownload = By.xpath("//div[@class='element-list collapse show']//li[@id='item-7']");
	public By btnUploadArquivo = By.xpath("//label[@for='uploadFile']");
	
	// Elementos Usados Na Pagina de Widgets
	
	public By btnWidgetsPaginaInicial = By.xpath("//div[@class='category-cards']//*[contains(text(),'Widgets')]");
	public By btnWidgetsPage = By.xpath("//div[@class='header-wrapper']//*[contains(text(),'Widgets')]");
	public By btnSlide = By.xpath("//ul[@class='menu-list']//*[contains(text(),'Slider')]");
	public By btnControll = By.xpath("//input[@class='range-slider range-slider--primary']");
	
	// Elementos Usados Na Pagina de Interactions
	
	public By btnInteractions = By.xpath("//div[@class='category-cards']//*[contains(text(),'Interactions')]");
	public By btnSortebla = By.xpath("//ul[@class='menu-list']//*[contains(text(),'Sortable')]");
	public By btnGrid = By.xpath("//a[@id='demo-tab-grid']");
	public By btnGridElemento = By.xpath("//div[@class='create-grid']//*[contains(text(),'One')]");
	public By btnDroppable = By.xpath("//ul[@class='menu-list']//*[contains(text(),'Droppable')]");
	public By btnSimple = By.xpath("//a[@id='droppableExample-tab-simple']");
	public By btnDraggableElemento = By.xpath("//div[@id='draggable']");
	
	
}
