# AbstractView
  The abstract class can be inherited of Android

Features
------------
* Simple and convenient and practical
* Helps you separate your logic and keep your class clear and clear
* Custom AbstractView by yourself

Usage
-----
1. Copy the files into your project.
  * AbstractActivity
  * AbstractFragment
  * AbstractFragmentActivity
 
2. Extents `AbstractActivity`, `AbstractFragment`, `AbstractFragmentActivity` according to your need and Add unimplemented methods, then you can write the following code in your java file.
  ```java
  public class MainActivity extends AbstractFragmentActivity {

  	@Override
  	public void initView() {
  		// TODO Auto-generated method stub
  		// setContentView and initView and setClick()
  	}
  
  	@Override
  	public void onClick(View arg0) {
  		// TODO Auto-generated method stub
  		// handle the View.OnClickListener
  	}
  	
  }
  ```
  ```java
  public class MainFragment extends AbstractFragment{
	
  	@Override
  	public int inflateView() {
  		// TODO Auto-generated method stub
  		// InflateView:return your layout resources id
  		return 0;
  	}
  	
  	@Override
  	public void initView() {
  		// TODO Auto-generated method stub
  		// initView and setClick()
  	}
  	
  	@Override
  	public void onClick(View arg0) {
  		// TODO Auto-generated method stub
  		// handle the View.OnClickListener
  	}
  
  }
  ```
3. Use the following methods according to your need.
 - `BeforeInflate()` 
 - `BeforeCreate()` 
 - `AfterCreate()`
 - `getData()`
 - `Other()`

Customization
-------------------
  By Rewrite AbstractView's code, you can easily customize whatever you want.
  
Sample
----------
  There is also a [sample](https://github.com/GitSmark/AbstractView/blob/master/AbstractViewSample.rar) to get you started.

Contact
--------
  Have problem? Just [tweet me](https://twitter.com/huangxy) or [send me an email](mailto:huangxy8023@foxmail.com).

License
----------

    Copyright 2016 huangxy@GitSmark

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
