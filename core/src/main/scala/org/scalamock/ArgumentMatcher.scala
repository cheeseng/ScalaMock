// Copyright (c) 2011-2012 Paul Butcher
// 
// Permission is hereby granted, free of charge, to any person obtaining a copy
// of this software and associated documentation files (the "Software"), to deal
// in the Software without restriction, including without limitation the rights
// to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
// copies of the Software, and to permit persons to whom the Software is
// furnished to do so, subject to the following conditions:
// 
// The above copyright notice and this permission notice shall be included in
// all copies or substantial portions of the Software.
// 
// THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
// IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
// FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
// AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
// LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
// OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
// THE SOFTWARE.

package org.scalamock

class ArgumentMatcher0(f: () => Boolean) extends Function1[Product, Boolean] {
  
  def apply(args: Product) = {
    assert(args.productArity == 0)
    f()
  }
}

class ArgumentMatcher1[T1](f: T1 => Boolean) extends Function1[Product, Boolean] {
  
  def apply(args: Product) = {
    assert(args.productArity == 1)
    f(args.productElement(0).asInstanceOf[T1])
  }
}

class ArgumentMatcher2[T1, T2](f: (T1, T2) => Boolean) extends Function1[Product, Boolean] {
  
  def apply(args: Product) = {
    assert(args.productArity == 2)
    f(args.productElement(0).asInstanceOf[T1], args.productElement(1).asInstanceOf[T2])
  }
}

class ArgumentMatcher3[T1, T2, T3](f: (T1, T2, T3) => Boolean) extends Function1[Product, Boolean] {
  
  def apply(args: Product) = {
    assert(args.productArity == 3)
    f(args.productElement(0).asInstanceOf[T1], args.productElement(1).asInstanceOf[T2], args.productElement(2).asInstanceOf[T3])
  }
}
