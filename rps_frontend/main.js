const {app, BrowserWindow} = require('electron');
const kill = require('kill-port');
const {spawn} = require('child_process');

const createWindow = () => {
  const win = new BrowserWindow({
    width: 800,
    height: 600,
    webPreferences: {
      nodeIntegration: true
    }
  });
  
  win.loadFile('index.html');
  
  win.on('closed', () => {
    kill(8080, 'tcp');
  });
}

const jarPath = app.getAppPath() + '/rps_backend-0.0.1-SNAPSHOT.jar';
spawn('java', ['-jar', jarPath, '']);
  
app.whenReady().then(createWindow);
  
app.on('window-all-closed', () => {
  if (process.platform !== 'darwin') {
    app.quit();
  }
});
  
app.on('activate', () => {
  if (BrowserWindow.getAllWindows().length === 0) {
    createWindow();
  }
});