package steps;

import java.awt.AWTException;

import elementos.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;
import runner.Executa;

public class Page2PaginaInicialBotaoInteractions {

	Metodos metodos = new Metodos();
	Elementos el = new Elementos();
	
	@Given("abrir o site clicar em interactions")
	public void abrir_o_site_clicar_em_interactions() {
	   
		Executa.abrirNavegador();
		metodos.pause(1000);
		metodos.scroll(400);
		metodos.clicar(el.btnInteractions);
		metodos.pause(1000);
		metodos.currentUrl("https://demoqa.com/interaction");
	}
	
	@Given("clicar em sortebla")
	public void clicar_em_sortebla() {
		
		metodos.scroll(500);
		metodos.pause(1000);
		metodos.clicar(el.btnSortebla);
		metodos.pause(1000);
		metodos.currentUrl("https://demoqa.com/sortable");
	}

	@When("clicar em grid")
	public void clicar_em_grid() throws AWTException {
	    
		metodos.clicar(el.btnGrid);
		metodos.pause(1000);
		metodos.scroll(200);
		metodos.pause(1000);
		metodos.evidencia("PaginaInteractionsSortableAntesDeMoverOElemento");
		metodos.pressionarEMover(el.btnGridElemento);
		metodos.pause(1000);
	}

	@Then("o usuario vai mover um objeto")
	public void o_usuario_vai_mover_um_objeto() {
	   
		metodos.evidencia("PaginaInteractionsSortableDepoisDeMoverOElemento");
		metodos.pause(1000);
		metodos.fecharNavegador();
		
	}
	
	@Given("clicar em Droppable")
	public void clicarEmDroppable() {
	    
		metodos.scroll(500);
		metodos.clicar(el.btnDroppable);
		metodos.pause(1000);
		metodos.currentUrl("https://demoqa.com/droppable");
	}
	@Given("clicar em simple")
	public void clicarEmSimple() {
	   
		metodos.scroll(150);
		metodos.clicar(el.btnSimple);
		metodos.pause(1000);
	}
	
	@When("clicar em drag me")
	public void clicaremDragMe() {
	   
		metodos.evidencia("PaginaInteractionsDroppableAntesDeMoverOElemento");
		metodos.pause(1000);
		metodos.clicar(el.btnDraggableElemento);
		metodos.pause(1000);
	}
	@Then("o usuario vai mover o objeto para Drop here")
	public void oUsuarioVaiMoverOObjetoParaDropHere() {
	   
		metodos.pressionarEMover(el.btnDraggableElemento);
		metodos.pause(1000);
		metodos.evidencia("PaginaInteractionsDroppableDepoisDeMoverOElemento");
		metodos.pause(1000);
		metodos.fecharNavegador();
	}
}
