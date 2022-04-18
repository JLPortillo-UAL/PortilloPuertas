package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.html.Label;

/**
 * A Designer generated component for the vista-pagina_principal template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-pagina_principal")
@JsModule("./src/vistas/vista-pagina_principal.ts")
public class VistaPagina_principal extends LitTemplate {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("vaadinScroller")
	private Scroller vaadinScroller;
	@Id("label")
	private Label label;



	public Scroller getVaadinScroller() {
		return vaadinScroller;
	}

	public void setVaadinScroller(Scroller vaadinScroller) {
		this.vaadinScroller = vaadinScroller;
	}

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}



	/**
     * Creates a new VistaPagina_principal.
     */
    public VistaPagina_principal() {
        // You can initialise any data required for the connected UI components here.
    }

}
