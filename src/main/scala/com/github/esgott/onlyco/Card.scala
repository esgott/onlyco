package com.github.esgott.onlyco

import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.html_<^._

object Card {

  case class Props(word: String)

  case class State(displayed: Boolean)

  class Backend(backendScope: BackendScope[Props, State]) {

    def render(props: Props, state: State): VdomElement =
      <.div(
        if (state.displayed) {
          <.p(props.word)
        } else {
          <.p()
        }
      )

  }

  val Component = ScalaComponent.builder[Props]
    .initialState(State(displayed = false))
    .renderBackend[Backend]
    .build

}
