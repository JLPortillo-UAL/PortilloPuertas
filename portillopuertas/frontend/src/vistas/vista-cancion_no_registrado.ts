import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-progress-bar/src/vaadin-progress-bar.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@polymer/iron-icon/iron-icon.js';

@customElement('vista-cancion_no_registrado')
export class VistaCancion_no_registrado extends LitElement {
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
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; justify-content: flex-start; align-items: center; align-self: flex-start;" id="vaadinHorizontalLayout">
  <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout1" style="width: 50%;">
   <vaadin-button theme="icon" aria-label="Add new" style="margin-top: 50px; width: 50px; height: 50px; flex-shrink: 1; margin-left: 40px;background:#276678;" id="min_cancion_no_registrado">
    <iron-icon id="ironIcon" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/icon-min.png?raw=true"></iron-icon>
   </vaadin-button>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout2" style="align-items: flex-end; width: 50%;">
   <vaadin-button id="creditos_no_registrado" style="margin-right: 100px; margin-top: 50px;">
    <iron-icon icon="lumo:edit" slot="prefix" id="ironIcon8"></iron-icon>Creditos 
   </vaadin-button>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; justify-content: center; flex-direction: column; height: 100%;" id="vaadinHorizontalLayout1">
  <label style="align-self: center; font-size:50px; font-weight:bold; margin-bottom: 25px;" id="nom2__canc_noReg">Nombre canción</label>
  <img style="width: 250px; height: 250px; align-self: center; margin-bottom: 40px;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/hola.png?raw=true" id="img_canc_noReg">
  <label style="align-self: flex-start; font-size:30px; font-weight:bold; margin-bottom: 15px; margin-left: 100px;" id="nom_canc_noReg">Nombre canción</label>
  <label style="align-self: flex-start; font-size:30px; font-weight:bold; margin-bottom: 25px; margin-left: 100px;" id="artista_canc_noReg">Nombre artista</label>
  <vaadin-progress-bar style="height: 20px; width: 80%; align-self: center;" id="vaadinProgressBar"></vaadin-progress-bar>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
