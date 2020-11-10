'use strict'

const html = document.querySelector("html");
const body = document.querySelector("body");
const checkbox = document.querySelector("input[type=checkbox]");

const getStyle = (element, style) => 
  window.getComputedStyle(element).getPropertyValue(style);

const initialColors = {
  bg: getStyle(body, "--bg"),
  colorText: getStyle(body, "--color-text"),
}

const darkMode = {
  bg: "#333333",
  colorText: "#fff",
}

const transformKey = key => 
  "--" + key.replace(/([A-Z])/, "-$1").toLowerCase();

const changeColors = (colors) => {
  console.log(colors)
  Object.keys(colors).map(key => 
    html.style.setProperty(transformKey(key), colors[key]) 
  )
}

checkbox.addEventListener("change", ({target}) => {
  target.checked ? changeColors(darkMode) : changeColors(initialColors)
});