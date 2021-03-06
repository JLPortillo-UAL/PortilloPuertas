import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-favoritos')
export class VistaFavoritos extends LitElement {
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
<vaadin-vertical-layout style="width: 100%;" id="vaadinVerticalLayout">
 <vaadin-horizontal-layout id="HorizontalCancion" style="width: 80%; justify-content: flex-start; align-self: center; background:#F0F0F0; height: 50px; margin-bottom: 25px;">
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout11" style="width: 20%;">
   <label style="align-self: center; margin-left: 30px;" id="titulolabel">Titulo cancion</label>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1" style="width: 20%;">
   <label style="align-self: center; margin-left: 40px;" id="artistalabel">Artista cancion</label>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1" style="width: 20%;">
   <label style="align-self: center; margin-left: 40px;" id="albumlabel">Album cancion</label>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1" style="width: 20%;">
   <label style="align-self: center; margin-left: 40px;" id="duracionlabel">Duracion cancion</label>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout3" style="width: 15%; justify-content: space-between;">
   <vaadin-button theme="icon" aria-label="Add new" id="bt_Izq" style="align-self: center;">
    <iron-icon id="ironIcon1" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/icon-fav.png?raw=true"></iron-icon>
   </vaadin-button>
   <vaadin-button theme="icon" aria-label="Add new" id="bt_Der" style="align-self: center; margin-left: 25px;">
    <iron-icon id="ironIcon" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/icon-shareblack.png?raw=true"></iron-icon>
   </vaadin-button>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
