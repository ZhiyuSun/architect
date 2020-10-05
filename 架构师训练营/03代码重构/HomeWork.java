
import java.util.ArrayList;
import java.util.List;

public class HomeWork {
    public static void main(String[] args) {
        Container winForm = new WinForm("WINDOW窗口");
        winForm.addComponent(new Picture("LOGO图片"));
        winForm.addComponent(new Button("登录"));
        winForm.addComponent(new Button("注册"));
        Frame frame = new Frame("FRAME1");
        frame.addComponent(new Label("用户名"));
        frame.addComponent(new TextBox("文本框"));
        frame.addComponent(new Label("密码"));
        frame.addComponent(new PasswordBox("密码框"));
        frame.addComponent(new CheckBox("复选框"));
        frame.addComponent(new Label("记住用户名"));
        frame.addComponent(new Linkable("忘记密码"));
        winForm.addComponent(frame);
        winForm.draw();
    }
    
    public class Component {
        private String text;
        public Component(String text){
            this.text=text;
        }
        public void draw(){
            System.out.println("print "+this.getClass().getSimpleName()+"("+this.text+")");
        }
    }

    public class Container extends Component {
        List<Component> components = null;
        public Container(String text) {
            super(text);
            components = new ArrayList<>();
        }

        @Override
        public void draw() {
            super.draw();
            int size = components.size();
            for (int i = 0; i < size; i++) {
                components.get(i).draw();
            }
        }

        public void addComponent(Component component) {
            this.components.add(component);
        }
    }

    
    public class Button extends Component {

        public Button(String text) {
            super(text);
        }
    }

    public class Label extends Component {
        public Label(String text) {
            super(text);
        }
    }

    public class Picture extends Component {
        public Picture(String text) {
            super(text);
        }
    }

    public class CheckBox extends Component {
        public CheckBox(String text) {
            super(text);
        }
    }

    public class TextBox extends Component {
        public TextBox(String text) {
            super(text);
        }
    }

    public class PasswordBox extends Component {
        public PasswordBox(String text) {
            super(text);
        }
    }

    public class Linkable extends Component {
        public Linkable(String text) {
            super(text);
        }
    }

    public class WinForm extends Container{
        public WinForm(String text) {
            super(text);
        }
    }

    public class Frame extends Container{
        public Frame(String text) {
            super(text);
        }
    }
}

