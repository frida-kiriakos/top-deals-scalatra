package com.github.frida_kiriakos.app

import org.scalatra._

class MyScalatraServlet extends HelloStack {

  get("/") {
    contentType="text/html"
    jade("index")
  }

}
