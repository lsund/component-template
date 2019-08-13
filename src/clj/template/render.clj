(ns template.render
  "Namespace for rendering views"
  (:require [hiccup.page :refer [html5 include-css include-js]]))


(defn index [params]
  (html5
   [:head
    [:title "Fixme"]]
   [:body
    [:h1 "Hello. Fixme please"]
    (apply include-js (:javascripts config))
    (apply include-css (:styles config))]))

(def not-found (html5 "not found"))
