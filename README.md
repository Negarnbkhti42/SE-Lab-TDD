# آزمایش سوم: TDD

مطابق با خواسته مساله، یک کلاس Rectangle را ایجاد می‌کنیم.

![rectangle class](./assets/Screen%20Shot%202023-11-13%20at%2010.13.09%20PM.png)

سپس تست‌هایی را برای آن می‌نویسیم. در ساختار تست‌های خود، الگوی arrange-act-assert را رعایت می‌کنند. این تست‌ها نیازمندی‌ها را برای محاسبه مساحت و تغییر ابعاد مستطیل پوشش می‌دهند.

![rectanlge tests](./assets/Screen%20Shot%202023-11-13%20at%2010.03.09%20PM.png);

سپس توابع لازم را پیاده سازی را می‌کنیم تا تست‌ها پاس شوند.

کار مشابه را برای مربع انجام می‌دهیم.

![square class](./assets/Screen%20Shot%202023-11-13%20at%2010.16.23%20PM.png)

![square tests](./assets/Screen%20Shot%202023-11-13%20at%2010.21.06%20PM.png)

پس از نوشتن تست‌ها، بدنه کلاس‌هاس خود را تکمیل می‌کنیم، به صورتی که با تست‌ها همخوانی داشته باشند.

روند را تا زمانی که تمامی تست‌ها پاس شوند انجام می‌دهیم.

![rectangle test pass](./assets/Screen%20Shot%202023-11-13%20at%2011.58.37%20PM.png)

![square test pass](./assets/Screen%20Shot%202023-11-13%20at%2011.58.46%20PM.png)

## پاسخ پرسش‌ها

1. در چرخه‌ی عمومی ایجاد نرم‌افزار، آزمون نرم‌افزار بعد از پیاده‌سازی نرم‌افزار انجام می‌شود، اما در روش TDD ابتدا unit test ها و سپس کد برنامه را می‌نویسیم. آیا این دو مورد با هم تناقضی دارند؟ در دو-سه خط توضیح دهید.

لزوما خیر. هر دو نوع تست می‌توانند در توسعه یک نرم‌افزار وجود داشته باشند. استفاده از TDD به ما کمک می‌کند تا در هنگام توسعه برنامه، باگ‌ها را سریع‌تر تشخیص بدهیم. اما در نهایت،‌برای آنکه مطمئن شویم برنامه نیازمندی‌های کاربر ما را برآورده می‌کند لازم است آزمون‌هایی پس از توسعه بر روی آن انجام شوند.

2. آزمون‌های واحد ریزدانه هستند. با بیان مثال، طیف آزمون‌ها بر اساس ریزدانگی یا درشت‌دانگی (granularity) را توضیح دهید.

منظور از grnularity در انواع تست‌ها، میزان جزئیاتی است که آن نوع تست به آن می‌پردازد. طیف ریزدانگی آزمون‌ها می‌تواند از تست توابع تا تست فرایندهای کامل را در بر بگیرد. برای مثال، در یک سامانه معرفی کتاب، کوچک‌ترین تست می‌تواند اضافه کردن یک کتاب به حافظه یا دریافت یک کتاب از حافظه با شماره شناسایی آن باشد. در سطح بالاتر می‌توان تست کرد که با فراخوانی یک API ، لیست کتاب‌های مورد علاقه یک کاربر برای او ارسال شود. در بالاترین سطح، با استفاده از یک رابط کاربری تمامی فرایند‌های درون برنامه تست می‌شوند.

3. آیا همه‌ی انواع آزمون‌های نرم‌افزار را برنامه‌نویسان به‌وجود می‌آورند؟

خیر. تیم‌های مختلفی از جمله تیم تضمین کیفیت در روند نوشتن آزمون‌ها دخیل هستند. در حقیقت نوعی تست به نام black box وجود دارد که در آن هیچ شناختی از ساختار داخلی برنامه وجود ندارد و صرفا ورودی‌ها و خروجی‌های برنامه آزموده می‌شوند.

4. اصول SOLID در کدام یک از گام‌های اصلی ایجاد نرم‌افزار (تحلیل نیازمندی‌ها، طراحی، پیاده‌سازی، آزمون و استقرار) استفاده می‌شوند؟ توضیح دهید.

![question4](./assets/question4.jpg)

5. فرض کنید در آزمایش بالا نیازی به تغییر ابعاد مستطیل نداشتیم. آیا در این حالت می‌توانستیم مربع را از مستطیل به ارث ببریم؟ توضیح دهید.

در واقع، اگر در آزمایش نیازی به تغییر ابعاد مستطیل نداشتیم و هر دو شیء به یک شکل (مستطیل یا مربع) محدود بودند، ممکن بود از یک ساختار ارث‌بری مشترک استفاده کرد. اما در این حالت می‌بایست تمام موارد مرتبط با مستطیل و مربع در یک کلاس مشترک قرار گیرند تا بتوان از ارث‌بری استفاده کرد.

به عبارت دیگر، باید یک کلاس اصلی مانند `Shape` داشته باشیدم که اطلاعات و متدهای مشترک بین مستطیل و مربع را در آن قرار دهید. سپس، از ارث‌بری برای ایجاد کلاس‌های `Rectangle` و `Square` استفاده کنیم.

