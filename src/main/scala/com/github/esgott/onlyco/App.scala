package com.github.esgott.onlyco

import japgolly.scalajs.react.extra.router.{BaseUrl, Router, RouterConfigDsl, SetRouteVia}
import org.scalajs.dom

import scala.scalajs.js.annotation.JSExport

object App {

  sealed trait Pages

  case object Main extends Pages

  private val routerConfig = RouterConfigDsl[Pages].buildConfig { dsl =>
    import dsl._

    (emptyRule
      | staticRoute(root, Main) ~> render(Card.Component(Card.Props("Hello")))
      )
      .noFallback
      .notFound(redirectToPage(Main)(SetRouteVia.HistoryReplace))
  }

  @JSExport
  def main(args: Array[String]): Unit = {
    val router = Router(BaseUrl.until_#, routerConfig)
    router().renderIntoDOM(dom.document.getElementById("root"))
  }

}
