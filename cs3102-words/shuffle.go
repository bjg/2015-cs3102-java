package main

import (
	"bufio"
	"fmt"
	"log"
	"os"
	"strings"

	"github.com/bjg/durstenfeld"
)

func main() {
	scanner := bufio.NewScanner(os.Stdin)
	words := []string{}
	for scanner.Scan() {
		words = append(words, scanner.Text())
	}
	if err := scanner.Err(); err != nil {
		log.Fatal("reading standard input: ", err)
	}
	shuffled := durstenfeld.RandInts(0, len(words))
	for _, i := range shuffled {
		fmt.Println(strings.ToLower(words[i]))
	}
}
