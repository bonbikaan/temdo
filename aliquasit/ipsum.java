   import com.example.jknack.handlebars.Handlebars;
   import com.example.jknack.handlebars.Template;

   public class MyTemplateRenderer {

       // Protected Handlebars instance
       protected Handlebars handlebars;

       // Constructor to initialize Handlebars
       public MyTemplateRenderer() {
           this.handlebars = new Handlebars();
       }

       // Method to render a template with data
       public String renderTemplate(String templateString, Object context) {
           try {
               // Compile the template
               Template template = handlebars.compileInline(templateString);
               // Apply the context (data) to the template
               return template.apply(context);
           } catch (Exception e) {
               // Handle the exception
               e.printStackTrace();
               return null;
           }
       }

       public static void main(String[] args) {
           MyTemplateRenderer renderer = new MyTemplateRenderer();
           
           // Sample template and data
           String templateString = "Hello, {{name}}!";
           Map<String, Object> context = new HashMap<>();
           context.put("name", "World");

           // Render the template
           String result = renderer.renderTemplate(templateString, context);
           System.out.println(result);  // Output: Hello, World!
       }
   }
   