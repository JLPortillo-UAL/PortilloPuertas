import { LitElement, html, css, customElement } from 'lit-element';
import './vista-cabecera_registrado';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import './vista-lista_canciones';
import './vista-barra_reproduccion';

@customElement('vista-playlist')
export class VistaPlaylist extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayout">
 <vista-cabecera_registrado style="width: 100%; height: 77px;" id="vistaCabecera_registrado"></vista-cabecera_registrado>
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout" style="width: 100%;">
  <label id="label" style="margin-top: 50px; margin-left: 100px; font-size:40px;">Nombre de la PlayList</label>
  <vaadin-button id="vaadinButton" style="margin-top: 65px; margin-left: 50px;">
   <iron-icon icon="lumo:edit" slot="prefix" id="ironIcon"></iron-icon>Cambiar nombre
  </vaadin-button>
 </vaadin-horizontal-layout>
 <label id="label1" style="margin-left: 86px; font-size:20px;">Nombre Autor</label>
 <hr id="hr" style="width: 90%;">
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1" style="width: 100%;">
  <vaadin-button id="vaadinButton1" style="margin-left: 170px; width: 120px;">
   Reproducir
  </vaadin-button>
  <vaadin-button id="vaadinButton2" style="margin-left: 50px; width: 120px;">
   Seguir
  </vaadin-button>
  <vaadin-button id="vaadinButton3" style="margin-left: 50px; width: 120px;">
   Compartir 
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vista-lista_canciones id="vistaLista_canciones" style="width: 100%;"></vista-lista_canciones>
 <vista-barra_reproduccion id="vistaBarra_reproduccion" style="width: 100%; height: 150px;"></vista-barra_reproduccion>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
