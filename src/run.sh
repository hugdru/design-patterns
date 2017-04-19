#!/usr/bin/env bash

set -e

script_dir="${0%/*}"
cd "$script_dir"

main() {
  if [[ $# -ne 1 ]]; then
    error
  fi

  src="$1"
  bin="$script_dir/../bin"

  mkdir -p "$bin"
  javac -sourcepath "$src" "$src"/*.java -d "$bin"
  java -classpath "$bin" "$src".Main
}

error() {
  exec 1>&2
  echo "$0 \"<PATH-TO-DESIGNPATTERN>\""
  echo -e "\nexamples:"
  echo "$0 behavioral/strategy"
  exit 1
}

main "$@"
